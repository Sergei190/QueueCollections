import java.util.*;


public class Main {
    public static void main(String[] args) {
        Queue <Person> queuePerson = new ArrayDeque<>();
        for (Person p : generateClient()) {
            queuePerson.offer(p);
        }
        System.out.println("Карусель запустилась!");

        while (!queuePerson.isEmpty()){
            if (queuePerson.peek().getNumberOfTickets() > 0){
                System.out.println((queuePerson.peek()) + " прокатился!");
                queuePerson.peek().setNumberOfTickets(queuePerson.peek().getNumberOfTickets()-1);
                queuePerson.offer(queuePerson.poll());
            }
            else {
                System.out.println(queuePerson.poll()+ " билеты закончились!");
            }
        }
        System.out.println("Билеты у всех закончились!");
    }

    public static List<Person> generateClient() {
        LinkedList<Person> list = new LinkedList<>();
        list.add(new Person("Сергей", "Кудряшов", 5));
        list.add(new Person("Герасим", "Иванов", 3));
        list.add(new Person("Оксана", "Кудряшова", 8));
        list.add(new Person("Марина", "Прокопьева", 4));
        list.add(new Person("Регина", "Гильванова", 1));
        return list;
    }
}