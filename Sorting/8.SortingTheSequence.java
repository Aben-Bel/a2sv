class Solution {
    public String sortSentence(String s) {
        String[] sentences = s.split(" ");
        for(int i=0;i<sentences.length;i++){
            int min = i;
            for(int j=i;j<sentences.length;j++){
                int num1 = (int) sentences[min].charAt(sentences[min].length()-1);
                int num2 = (int) sentences[j].charAt(sentences[j].length()-1);
                if(num1 > num2) {
                    min = j;
                }
            } 
            String temp = sentences[min];
            sentences[min] = sentences[i];
            sentences[i] = temp.substring(0,temp.length()-1);
        }

        return "".join(" ", sentences);
    }
}