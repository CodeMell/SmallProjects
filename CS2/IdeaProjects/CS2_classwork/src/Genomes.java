/**
 * Created by cody on 2/23/16.
 */


public class Genomes {
    public static String findGene(String genome){
        int n = genome.length();
        int beg = -1;
        int end = -1;
        String gene = "";
        String startCod = "ATG";
        String stopCod1 = "TAG";
        String stopCod2 = "TAA";
        String stopCod3 = "TGA";
        //find start codon
        for(int i = 0; i < n; i++){
            if(genome.substring(i,i+3).equals(startCod)){
                beg = i+3;
            }
            //find stop codon
            for(int j = i; j < n; j++){
                if(genome.substring(j,j+3).equals(stopCod1) || genome.substring(j,j+3).equals(stopCod2)
                        || genome.substring(j,j+3).equals(stopCod3)){
                    end = j;
                }
                gene = genome.substring(beg,end);
            }
        }
        return gene;
    }


    public static void main(String[] args){
        String genome = "ATAGATGCATAGCGCATAGCTATGTGCTAGC";
        System.out.println(findGene(genome));
    }
}


