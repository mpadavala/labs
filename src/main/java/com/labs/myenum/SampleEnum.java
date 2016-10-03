package com.labs.myenum;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public enum SampleEnum {
	
		 ONE("one", 1),
		 TWO("two", 2);

		private final String name;
		private final int value;

		private static Map<String, SampleEnum> keyMap = new HashMap<String, SampleEnum>();

		static{
			SampleEnum[] list = SampleEnum.class.getEnumConstants();
			if(list != null && list.length > 0){
				for(SampleEnum obj : list){
					keyMap.put(obj.name, obj);
				}
			}

		}

		private SampleEnum(String name, int value){
			 this.name = name;
			 this.value = value;
		}

		
		public String getName() {
			return name;
		}

		public int getValue() {
			return value;
		}

		public static SampleEnum get(String str){
			return keyMap.get(str);
		}



	};
	

