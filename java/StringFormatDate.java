class Solution {
    public String reformatDate(String date) {
        date = date.trim();
        String[] parts = date.split(" ");

        String day = parts[0];
        String month = parts[1];
        String year = parts[2];
        day = day.substring(0, day.length() - 2);
        if (day.length() == 1) {
            day = "0" + day;
        }

        String monthNum = "";
        if (month.equals("Jan")) monthNum = "01";
        if (month.equals("Feb")) monthNum = "02";
        if (month.equals("Mar")) monthNum = "03";
        if (month.equals("Apr")) monthNum = "04";
        if (month.equals("May")) monthNum = "05";
        if (month.equals("Jun")) monthNum = "06";
        if (month.equals("Jul")) monthNum = "07";
        if (month.equals("Aug")) monthNum = "08";
        if (month.equals("Sep")) monthNum = "09";
        if (month.equals("Oct")) monthNum = "10";
        if (month.equals("Nov")) monthNum = "11";
        if (month.equals("Dec")) monthNum = "12";
        return year + "-" + monthNum + "-" + day;
    }
}
