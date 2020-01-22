import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OwlPopulation {
private String fileName;
private Owl[] data;

public void populateData() throws FileNotFoundException {
        File f = new File(fileName);
        Scanner scanner = new Scanner(f);

        int numLines = 0;
        while(scanner.hasNextLine()) {
                numLines++;
                String s = scanner.nextLine();
        }

        scanner.close();

        data = new Owl[numLines];   //data is is allocated the exact amount of space it needs
        scanner = new Scanner(f);
        for(int i =0; i<numLines; i++) {
                String fileLine = scanner.nextLine();
                String[] newOwl =fileLine.split(",");
                data[i]= new Owl(newOwl[0],Integer.parseInt(newOwl[1]),Double.parseDouble(newOwl[2]));

        }
        //TODO: Populate the data with owls constructed from the lines of the file given
}

public OwlPopulation(String fileName) throws FileNotFoundException {
        //TODO: Populate the class variables in OwlPopulation
        this.fileName=fileName;
        this.populateData();
}

public double averageAge(){
        //TODO: implement
        double average=0;
        double sum=0;
        for(int i =0; i<data.length; i++) {

                average=average+ data[i].getWeight();


        }
        sum = average/data.length;
        return sum;


}

public Owl getYoungest(){
        //TODO: implement
        int youngest=10000;
        Owl youngOwl= new Owl("ted",12,13.2);
        if(data.length==0) {
                return null;
        }
        else{
                for(int i = 0; i<data.length; i++) {
                        int currentOwl=data[i].getAge();
                        if(currentOwl<youngest) {
                                youngest=currentOwl;
                                youngOwl= data[i];

                        }

                }
        }
        return youngOwl;

}

public Owl getHeaviest(){
        //TODO: implement
        double heaviest = 0.0;
        Owl heavyOwl = new Owl("jim",12,14.2);
        if (data.length==0) {  return null;}
        else{
                for(int i=0; i<data.length; i++) {
                        double currentOwl=data[i].getWeight();
                        if(currentOwl>heaviest) {
                                heaviest=currentOwl;
                                heavyOwl=data[i];
                        }
                }
        }
        return heavyOwl;
}

public String toString(){
        //TODO: implement

        String summary;
        summary= "The name of the youngest Owl is "+ getYoungest().getName()+" and the age of the youngest Owl is "+ getYoungest().getAge()+" and the name of the heaviest owl is "+getHeaviest().getName()+" the age of the heaviest owl is "+ getHeaviest().getAge()+" the average age of population is "+averageAge();
        return summary;
}

public boolean containsOwl(Owl other){
        //TODO: method you can implement as a helper function to your merge method
        if(other.equals(data)){
          return true;
        }
        else{
        return false;
      }
}
public void merge(OwlPopulation other){
        //TODO: a brief overview of what you can do to implement this method is given below:
//private OwlPopulation pop[];
        //1) determine (and store) the distinct owls in the other population.
        for(int i =0;i<data.length; i++){
          if(containsOwl(data[i])==false){
            data[i]+=
          }
        }
        //2) make a new data array to hold the correct number of owls for the merged population

        //3) copy over the distinct owls from each population to the data array

        //4) set the new data array to "this" data (where is the merged population? what happens to the original populations?)
}

public int popSize(){
        return data.length;
}
public static void main(String[] args) {
        try {

                //The following should run when you are complete. Feel free to comment out as you see fit while you work.
                OwlPopulation pop1 = new OwlPopulation("owlPopulation1.csv");
                System.out.println(pop1);
                System.out.println(pop1.popSize());

                OwlPopulation pop2 = new OwlPopulation("owlPopulation2.csv");
                System.out.println(pop2);
                System.out.println(pop2.popSize());

                pop1.merge(pop2);
                System.out.println(pop1);
                System.out.println(pop1.popSize());

        }
        catch (FileNotFoundException f) {
                System.out.println("File not found.");
        }
}


}
