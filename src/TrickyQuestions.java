public class TrickyQuestions {

    public static void main(String args[]){

        //Headset return for th Given Element, and it will sor automatically
        var frenchCities = new java.util.TreeSet<String>();
        frenchCities.add("Paris");
        frenchCities.add("Marseille");
        frenchCities.add("Lyon");
        frenchCities.add("Lille");
        frenchCities.add("Toulouse");
        System.out.println(frenchCities.headSet("Marseille"));

        String s = " ";
        System.out.print("[" + s.strip());
        s = " hello ";
        System.out.print("," + s.strip());
        s = "h i ";
        System.out.print("," + s.strip() + "]");


        StringBuffer us = new StringBuffer("US");
        StringBuffer uk = new StringBuffer("UK");
        java.util.stream.Stream<StringBuffer> stream = java.util.stream.Stream.of(us, uk);
        String output = stream.collect(java.util.stream.Collectors.joining("-", "=", ""));
        System.out.println("\n" + output);

        java.util.List<String> frenchAuthors = new java.util.ArrayList<>();
        frenchAuthors.add("Victor Hugo");
        frenchAuthors.add("Gustave Flaubert");

        var cabarets = new java.util.TreeMap<>();
        cabarets.put(1, "Moulin Rouge");
        cabarets.put(2, "Crazy Horse");
        cabarets.put(3, "Paradis Latin");
        cabarets.put(4, "Le Lido");
        cabarets.put(5, "Folies Berg??re");
        System.out.println(cabarets.subMap(2, true, 5, false));

        java.util.List<String> abc = java.util.List.of("a", "b", "c");
        abc.stream().forEach(x -> {
            x = x.toUpperCase();
        });
        abc.stream().forEach(System.out::print);


    }
}
