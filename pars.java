public class Main {
    public static void main(String[] args) {
        var document = Jsoup.connect("https://yandex.ru/pogoda/irkutsk?lat=52.28959&lon=104.280608").get();
        //System.out.println(document);
        var dayElement = document.select("div.forecast-briefly__name");
        String dayElement_list = dayElement.text();
        //          System.out.println(dayElement_list);
        String[] day_words = dayElement_list.split("\\s");
        //System.out.println(Arrays.toString(day_words));
        System.out.println(day_words[0]);
        System.out.println(day_words[1]);
        System.out.println(day_words[2]);
        System.out.println(day_words[3]);

        var tempElement = document.select("div.forecast-briefly__temp_day");
        String tempElement_list = tempElement.text();
        //System.out.println(tempElement_list);
        String[] temp_words = tempElement_list.split("\\s");
        System.out.println(temp_words[0]);
        System.out.println(temp_words[1]);
        System.out.println(temp_words[2]);
        System.out.println(temp_words[3]);
        System.out.println("Hello world!");
    }
}
