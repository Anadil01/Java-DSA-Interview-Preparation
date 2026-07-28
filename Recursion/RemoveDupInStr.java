public class RemoveDupInStr {

    public static void removesDuplicates(String str , int idx , StringBuilder newStr  , boolean map[]){
      if(idx == str.length()){
        System.out.println(str);
        return;
      }
      char currChar = str.charAt(idx);
      if(map[currChar - 'a'] == true){
        removesDuplicates(str, idx+1, newStr, map);
      }else{
        map[currChar - 'a'] = true;
        removesDuplicates(str, idx+1, newStr.append(currChar), map);
      }
    }
    public static void main(String[] args) {
        String str = "appnacollege";
        removesDuplicates(str, 0, new StringBuilder (""), new boolean [24]);
    }
}
