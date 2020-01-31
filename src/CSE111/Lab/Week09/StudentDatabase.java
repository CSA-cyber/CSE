package CSE111.Lab.Week09;

import java.util.Arrays;

/**
 * 
 * 
 * Ei class ta database manage kore
  
  */

public class StudentDatabase{
    
    Student [] records;
    
    /**
     * Eita diye vaat khawa jai
     */
    void printDatabase(){
        int c=0; /* jj*/
        while(c<records.length){ //5
            System.out.println(records[c].toString());
            ++c;
        }
    }
    /**
     * eita name diye sort kore dey
     * This takes no parameter
     */
//    void sortByName(){
//        int i = 0, j;
//        Student temp;
//        while (i<records.length-1){
//            j=i+1;
//            while (j<records.length){
//                if(records[i].name.compareTo(records[j].name)>1){
//                    temp = records[i];
//                    records[i] = records[j];
//                    records[j] = temp;
//                }
//                j++;
//            }
//            i++;
//        }
//    }

    void sortByName(){
           Arrays.sort(records, (s1, s2) -> s1.name.compareTo(s2.name));
    }

    void sortByID(){
        int i,j;
        Student tmp;
        i=0;
        while(i<records.length){
            j=1;
            while(j<records.length){// "batman".compareTo("badman")  
                if(records[j-1].id.compareTo(records[j].id)>0){
                    tmp=records[j-1];
                    records[j-1]=records[j];
                    records[j]=tmp;
                }
                ++j;
            }
            ++i;
        }
    }
    void sortBySection(){
        System.out.println("parina");
    }
    void sortByMark(){
        int i,j;
        Student tmp;
        i=0;
        while(i<records.length){
            j=1;
            while(j<records.length){
                if(records[j-1].mark > records[j].mark){
                    tmp=records[j-1];
                    records[j-1]=records[j];
                    records[j]=tmp;
                }
                ++j;
            }
            ++i;
        }
    }
}
