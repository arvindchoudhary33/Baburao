class Invertcase
{
	public static String invertCase(String str)
	{
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			chars[i] = Character.isUpperCase(chars[i])
						? Character.toLowerCase(chars[i])
						: Character.toUpperCase(chars[i]);
		}
		return new String(chars);
	}

	public static void main(String[] args) {
		String str = args[0];
		System.out.println(invertCase(str));
	}
}