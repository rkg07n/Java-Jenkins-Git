public class Hello{
	
	public static void main(String[] args){
		for (int i=0; i<=10; i++){
			System.out.println("Hello World..." + i );
		}
	}
}


// Java-Jenkins-Git  
// (Folder name in GIT directory as well Repo name in GitHub)
// Save this file as Hello.java in "Java-Jenkins-Git" Directory 
// Go to Command Line of and go to path where you saved this file
// In CLI type c:> javac Hello.java 
// In the folder you may see it created Hello.class file there 
// Now in CLI run c:> java Hello 
// This will print Hello World 10 times 
// In the CLI type: git init to make it a GIT repository
// git status
// git add .
// git commit -m "Java Prj added on GIT"
//
// git remote add origin 
//        https://github.com/RKtheDragon/Java-Jenkins-Git.git
// git push -u origin master
// 
// Go to Jenkins --> 
//         Add New Item --> HelloWoldLoop
//         FreeStyle Project --> 
//         Build --> Execute Windows Batch Command 
//            cd C:\Users\rkg07\Documents\Git\Java-Jenkins-Git
//		      javac Hello.java 
//            java Hello 
//      --> Build 
//      --> Console Output 
//






