public class Main {
    public static void main(String[] args) {

        Animal[] animal = {new Snake(),
                           new Turtle(),
                           new Eagle()};

        animalMethod(new Snake());
        animalMethod(new Turtle());
        animalMethod(new Eagle());

     //   for (Animal an : animal) {
          //  if (an instanceof Snake) {
         //       an.walk();
        //    }
            for (Animal an : animal) {
                System.out.println(an.getClass());
                System.out.println(an.getClass().getName()); {
                    an.walk();
                }
            }
        }
        Snake[] snake = {new Snake()};
        Turtle [] turtle = {new Turtle()};
        Eagle [] eagle = {new Eagle()};

        public static void animalMethod (Animal animal) {
        animal.walk();
    }
}