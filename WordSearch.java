public class WordSearch{
    private char[][]data;


    public WordSearch(int rows,int cols){
      data = new char[cols][rows];
		  for (int i = 0; i < data.length; i++){
			     for (int z = 0; z < data[i].length; z++){
				         data[i][z] = '_';
			     }
		  }
    }


    private void clear(){
      for(int i; i < data.length; i++){
        for (int z; data[i].length; z++){
          data[i][z] = '_'
        }
      }
    }



    public String toString(){
    }



    public boolean addWordHorizontal(String word,int row, int col){
    }



    public boolean addWordVertical(String word,int row, int col){
    }
}
