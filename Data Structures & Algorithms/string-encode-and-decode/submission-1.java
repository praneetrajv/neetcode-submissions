class Solution {

    public String encode(List<String> strs) {
        String encoded_string = "";

        for (int i = 0; i < strs.size(); i++) {
            encoded_string += strs.get(i).length() + "#";
            encoded_string += strs.get(i);
        }

        return encoded_string;
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            String temp = "";
            while (str.charAt(i) != '#') {
                temp += str.charAt(i);
                i++;
            }

            int temp_num = Integer.valueOf(temp);

            i++;
            
            temp = "";
            while (temp_num > 0) {
                temp += str.charAt(i);
                i++;
                temp_num--;
            }

            decoded_strs.add(temp);
        }

        return decoded_strs;
    }
}