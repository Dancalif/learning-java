public class MySchedule
{
  public static void main(String[] args)
  {
    //String strEnglish, strPrecalc, strMusic, strBio, strPrincip, strLatin, strAP, strBusiness;
    //String strEnglishName, strPrecalcName, strMusicName, strBioName, strPrincipName, strLatinName, strAPName, strBusinessName;
    
    String[] eduSubjects = {"English III", "Precalculus", "Music Theory", "Biotechnology", "Principles of Technology", "Latin II", "AP US History", "Business Computer Information Systems"};
    String[] teacherNames = {"Ms. Lapan", "Mrs. Giden", "Mr. Davis", "Ms. Palmer", "Ms. Garcia", "Mrs. Barnett", "Ms. Jahanssen", "Mr. James"};
                
    String dashes = "-";
    
   	for (int i = 0; i < 80; i++){
    System.out.print(dashes);
    
    }
    for (int j = 0; j < 8; j++){
    	System.out.printf("\n| %d | %37s | %16s |", j+1, eduSubjects[j], teacherNames[j]);
    }
    
    System.out.println("");
    
    for (int k = 0; k < 80; k++){
    	System.out.print(dashes);
    }
  }
}
