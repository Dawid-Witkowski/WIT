
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalFabric
{
    private final static HashMap<String,AnimalMaker> map=new HashMap<String,AnimalMaker>()
    {
        {
            put("Cat",(name)->new Cat(name));
            put("Dog",(name)->new Dog(name));
            put("Cow",(name)->new Cow(name));
            put("Fly",(name)->new Fly(name));
            put("Spider",(name)->new Spider(name));
            put("Ladybug",(name)->new Ladybug(name));
            put("Snake",(name)->new Snake(name));
            put("Turtle",(name)->new Turtle(name));
            put("Lizard",(name)->new Lizard(name));
        }
    };
    public static Animal make(String kind,String name)
    {
        return map.get(kind).make(name);
    }
    //*/// Wersja A
    public static List<String> keys()
    {
        return 
            map
            .keySet()
            .stream()
            .sorted(Comparator.naturalOrder())
            .collect(Collectors.toList())
                
        ;
    }
    /*/// Wersja B
    public static String[] keys()
    {
        String[] srt=map.keySet().toArray(new String[0]);
        Arrays.sort(srt);
        return srt;
    }
    //*/// Koniec Alternatyw
}

interface AnimalMaker
{
    Animal make(String name);
}

class Animal 
{
    private String name;
    public Animal(String name) { this.name=name; }
    public String path() { return ""; }
    @Override public String toString() { return path() + name; }
}

class Mammal extends Animal
{
    public Mammal(String name) { super(name); }
    @Override public String path() { return super.path()+"Mammal : "; }
}

class Insect extends Animal
{
    public Insect(String name) { super(name); }
    @Override public String path() { return super.path()+"Insect : "; }
}

class Reptile extends Animal
{
    public Reptile(String name) { super(name); }
    @Override public String path() { return super.path()+"Reptile : "; }
}

class Cat extends Mammal
{
    public Cat(String name) { super(name); }
    @Override public String path() { return super.path()+"Cat : "; }
}

class Dog extends Mammal
{
    public Dog(String name) { super(name); }
    @Override public String path() { return super.path()+"Dog : "; }
}

class Cow extends Mammal
{
    public Cow(String name) { super(name); }
    @Override public String path() { return super.path()+"Cow : "; }
}

class Fly extends Insect
{
    public Fly(String name) { super(name); }
    @Override public String path() { return super.path()+"Fly : "; }
}

class Spider extends Insect
{
    public Spider(String name) { super(name); }
    @Override public String path() { return super.path()+"Spider : "; }
}

class Ladybug extends Insect
{
    public Ladybug(String name) { super(name); }
    @Override public String path() { return super.path()+"Ladybug : "; }
}

class Snake extends Reptile
{
    public Snake(String name) { super(name); }
    @Override public String path() { return super.path()+"Snake : "; }
}

class Turtle extends Reptile
{
    public Turtle(String name) { super(name); }
    @Override public String path() { return super.path()+"Turtle : "; }
}

class Lizard extends Reptile
{
    public Lizard(String name) { super(name); }
    @Override public String path() { return super.path()+"Lizard : "; }
}
