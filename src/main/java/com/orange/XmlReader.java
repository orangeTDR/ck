package com.orange;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.orange.pojo.Empoy;

public class XmlReader {

	public static void main(String[] args) throws DocumentException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		List<Empoy> empoys = getEmploies();
		for (Empoy empoy : empoys) {
			System.out.println(empoy);
		}
	}

	private static List<Empoy> getEmploies() throws DocumentException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class clazz = Empoy.class;
		//创建容器存储employ
		List<Empoy> empoys = new ArrayList<>();
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(XmlReader.class.getResourceAsStream("/students.xml"));
		//获取根节点
		Element root = document.getRootElement();
		//获取根节点的所以子节点
		List<Element> elements = root.elements();
		for (Element subElement : elements) {
			Empoy empoy = new Empoy();
			//获取id属性
			Attribute idAttr = subElement.attribute("id");
			//获得Id值
			String id = idAttr.getValue();
			empoy.setId(id);
			//获得子子元素
			List<Element> employSubElements = subElement.elements();
			for (Element emplySubElement : employSubElements) {
				String name = emplySubElement.getName();
				
				String value = emplySubElement.getStringValue();
				/*if("name".equals(name)){
					empoy.setName(value);
				}else if("age".equals(name)){
					empoy.setAge(value);
				}else if("dname".equals(name)){
					empoy.setdName(value);
				}else if("gender".equals(name)){
					empoy.setGender(value);
				}*/
				String methodName = "set" + (name.charAt(0)+"").toUpperCase()+name.substring(1);
				Method method = clazz.getMethod(methodName, String.class);
				method.invoke(empoy, value);
				
			}
			empoys.add(empoy);
		}
		return empoys;
	}
}
