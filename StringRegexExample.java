	public String convertAndPrepareDateFields(String value) {
		
		if(value == null)
			return "";
		
		String regex = "....-..-..T..:..:..\\..........Z";
		
		Matcher matcher = Pattern.compile(regex).matcher(value);
		
		while (matcher.find()) {
			String matchValue = matcher.group();
			String matchValueNew = "\"" + matchValue + "\"";
			value = value.replace(matchValue, matchValueNew);
		}
		return value;
	}
