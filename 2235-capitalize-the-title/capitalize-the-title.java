class Solution {
    public String capitalizeTitle(String title) {
        String arr[] = title.split(" ");
        for(int i=0; i<arr.length; i++){
            String str = arr[i];
            if(str.length() > 2){
                str = str.toLowerCase();
                str = str.substring(0,1).toUpperCase() + str.substring(1);
            }else{
                str = str.toLowerCase();
            }
            arr[i] = str;
        }

        StringBuilder sb = new StringBuilder(arr[0]);

        for(int i=1; i<arr.length; i++){
            sb.append(" ");
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}