class Board{
	
	public int costOfBoard;
	public double sizeOfBoard;
	public String boardColor;
	
	public void setcostOfBoard(int costOfBoard){
		this.costOfBoard=costOfBoard;
	}
	
	public void setsizeOfBoard(double sizeOfBoard){
		this.sizeOfBoard=sizeOfBoard;
	}
	
	public void setboardColor(String boardColor){
		this.boardColor=boardColor;
	}
	
	public int getcostOfBoard(){
		System.out.println("the cost of board is==="+costOfBoard);
		return costOfBoard;
	}
	
	public double getsizeOfBoard(){
		System.out.println("the size of board is==="+sizeOfBoard);
		return sizeOfBoard;
	}
	
	public String getboardColor(){
		System.out.println("board color is==="+boardColor);
		return boardColor;
	}
	
}