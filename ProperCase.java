class ProperCase {
    public static void main(String args[]) {
        String s = "java is programming language";
        String str[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String i : str) {
            sb.append(Character.toUpperCase(i.charAt(0))).append(i.substring(1).toLowerCase()).append(" ");
        }
        System.out.println("final results : "+sb);
    }
}