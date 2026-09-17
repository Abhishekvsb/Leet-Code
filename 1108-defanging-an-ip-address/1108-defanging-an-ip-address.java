class Solution {
    public String defangIPaddr(String address) {
        Scanner sc=new Scanner(System.in);
        String s=address.replace(".","[.]");
        return s;
    }
}