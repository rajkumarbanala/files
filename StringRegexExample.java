	public String fixAllDateTags(String value) {
		
		if(value == null)
			return "";
		
		System.out.println("value:" + value);
		
		//" :2021-08-19T11: 18: 35.042006518Z
		String regex1 = "\": ....-..-..T..:..:..\\..........Z";
		
		Matcher matcher = Pattern.compile(regex1).matcher(value);
		
		while (matcher.find()) {
			
			String matchValue = matcher.group();
			System.out.println("matchValue:" + matchValue);
			
			String regexSub = "....-..-..T..:..:..\\..........Z";
			
			Matcher matcherSub = Pattern.compile(regexSub).matcher(matchValue);
			
			while (matcherSub.find()) {
				
				String matchValueSub = matcherSub.group();
				System.out.println("matchValueSub:" + matchValueSub);
				
				String matchValueSubNew = "\"" + matchValueSub;
				System.out.println("matchValueSubNew:" + matchValueSubNew);
				
				String matchValueNew = "\": " + matchValueSubNew + "\"";
				System.out.println("matchValueNew:" + matchValueNew);
				
				value = value.replace(matchValue, matchValueNew);
			}
		}
		
		//" :2021-08-19T16:39:13Z 
		String regex2 = "\": ....-..-..T..:..:..Z";
		
		matcher = Pattern.compile(regex2).matcher(value);
		
		while (matcher.find()) {
			
			String matchValue = matcher.group();
			System.out.println("matchValue:" + matchValue);
			
			String regexSub = "....-..-..T..:..:..Z";
			
			Matcher matcherSub = Pattern.compile(regexSub).matcher(matchValue);
			
			while (matcherSub.find()) {
				
				String matchValueSub = matcherSub.group();
				System.out.println("matchValueSub:" + matchValueSub);
				
				String matchValueSubNew = "\"" + matchValueSub;
				System.out.println("matchValueSubNew:" + matchValueSubNew);
				
				String matchValueNew = "\": " + matchValueSubNew + "\"";
				System.out.println("matchValueNew:" + matchValueNew);
				
				value = value.replace(matchValue, matchValueNew);
			}
		}

		//" :2021-08-19T16: 39: 13Z 
		String regex3 = "\": ....-..-..T..: ..: ..Z";
		matcher = Pattern.compile(regex3).matcher(value);
		
		while (matcher.find()) {
			
			String matchValue = matcher.group();
			System.out.println("matchValue:" + matchValue);
			
			String regexSub = "....-..-..T..: ..: ..Z";
			
			Matcher matcherSub = Pattern.compile(regexSub).matcher(matchValue);
			
			while (matcherSub.find()) {
				
				String matchValueSub = matcherSub.group();
				System.out.println("matchValueSub:" + matchValueSub);
				
				String matchValueSubNew = "\"" + matchValueSub;
				System.out.println("matchValueSubNew:" + matchValueSubNew);
				
				String matchValueNew = "\": " + matchValueSubNew + "\"";
				System.out.println("matchValueNew:" + matchValueNew);
				
				value = value.replace(matchValue, matchValueNew);
			}
		}
		
		System.out.println("value:" + value);
		
		return value;
	}
