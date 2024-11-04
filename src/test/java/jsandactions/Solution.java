package jsandactions;

import java.io.*;
import java.util.*;

interface IAnimal {
    void setId(int id);
    int getId();
    void setSpecies(String species);
    String getSpecies();
    void setName(String name);
    String getName();
    void setAge(int age);
    int getAge();
}

interface IZoo {
    void addAnimal(IAnimal animal);
    void removeAnimal(int id);
    int countAnimals();
    List<IAnimal> getAnimalsBySpecies(String species);
    List<Map.Entry<Integer, List<IAnimal>>> getAnimalsByAge();
}

class Animal implements IAnimal {
    int id;
    String species;
    String name;
    int age;
    public int getId(){
        return id;
    }
    public String getSpecies(){
        return species;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setId(int id){
        this.id = id;
    }
    public void  setSpecies(String species){
        this.species = species;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    
}

class Zoo implements IZoo {
    List<IAnimal> animals = new ArrayList<>();
    public void addAnimal(IAnimal animal){
        animals.add(animal);
    }
    public void removeAnimal(int id){
        for(int i = 0; i < animals.size(); ++i){
            if(animals.get(i).getId() == id){
                animals.remove(i);
                break;
            }
        }
    }
    public int countAnimals(){
        return animals.size();
    }
    public List<IAnimal> getAnimalsBySpecies(String species){
        List<IAnimal> selected = new ArrayList<>();
        for(int i = 0; i < animals.size(); ++i){
            if(animals.get(i).getSpecies().equals(species)){
                selected.add(animals.get(i));
            }
        }
        return selected;
    }
    
    public List<Map.Entry<Integer, List<IAnimal>>> getAnimalsByAge(){
        Map<Integer, List<IAnimal>> ageMap = new HashMap<>();
        for(int i = 0; i < animals.size(); ++i){
            Integer age = animals.get(i).getAge();
            List<IAnimal> blank = new ArrayList<>();
            ageMap.putIfAbsent(age, blank);
            ageMap.get(age).add(animals.get(i));
        }
        List<Map.Entry<Integer, List<IAnimal>>> entryList = new ArrayList<>();
        for(Map.Entry<Integer, List<IAnimal>> entry : ageMap.entrySet()){
            entryList.add(entry);
        }
        return entryList;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        IZoo zoo = new Zoo();
        int aCount = Integer.parseInt(br.readLine().trim());
        for (int i = 1; i <= aCount; i++) {
            String[] a = br.readLine().trim().split(" ");
            IAnimal e = new Animal();
            e.setId(Integer.parseInt(a[0]));
            e.setSpecies(a[1]);
            e.setName(a[2]);
            e.setAge(Integer.parseInt(a[3]));
            zoo.addAnimal(e);
        }

        out.println("There are " + zoo.countAnimals() + " animals in the zoo");
        String[] b = br.readLine().trim().split(" ");
        String species = b[0];
        List<IAnimal> specAnimals = zoo.getAnimalsBySpecies(species);
        out.println(species + ":");
        for (IAnimal sp : specAnimals) {
            out.println("" + sp.getName() + " (" + sp.getAge() + " years old)");
        }
        List<Map.Entry<Integer, List<IAnimal>>> animalsByAge = zoo.getAnimalsByAge();
        out.println("Animals by age:");
        for (Map.Entry<Integer, List<IAnimal>> groups : animalsByAge) {
            out.println("" + groups.getKey() + " year(s) old:");
            for (IAnimal animal : groups.getValue()) {
                out.println("- " + animal.getName() + " (" + animal.getSpecies() + ")");
            }
        }
        String[] c = br.readLine().trim().split(" ");
        int id = Integer.parseInt(c[0]);
        zoo.removeAnimal(id);
        out.println("There are now " + zoo.countAnimals() + " animals in the zoo");

        out.flush();
        out.close();
    }
}