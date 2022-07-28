public class ExpressionTree{


    //You must write this method:
    //Calculate the value of the entire tree
    public double evaluate(){

      // Return data if node is a leaf return the value
       if(isValue())
       {
         return value;
       }
       else 
       { // Evaluate and store left child
        //int l = left.evaluate();
     
     
         // Evaluate and store right child
        // int r = right.evaluate();
       }
      
      return apply(left.evaluate(), right.evaluate(), operator);//result of operation;
    }

    //You must write this method:
    //Return a string representation of the tree
    //A value is just hte string of the value
    //An operation has parenthesis around
    //such as
    //"12.5"  //just a value
    //"(5.0-8.0)" //a tree with 2 value children
    //"(12.5*(5.0-8.0)) //a tree that is the product of the previous two example trees
    //"(((2.0+1.0)/(8.0*0.43)) - 1.0)" //a tree with more
    public String toString(){
      String output = " ";

      if (isValue())
      {
        output +=value;
      }
      else
      {
        output += "(" + left.toString() + operator + right.toString() + ")";
          
      }
     return output;
    }

 public String toStringPrefix() 
  {
     String output = "";
    if(isValue())
    {
      output += value;
    }
    else
    {
      output += "(" + operator + " " + left.toString() + " " + right.toString() + ")";
    }
    return output;
  }


  private double value;
  private ExpressionTree left,right;
  private char operator;

  //Tree can be a value
  public ExpressionTree(double val){
   value = val;
   left = null;
   right = null;
  }

  //Tree can be an operator that connects two sub-trees
  public ExpressionTree(char op, ExpressionTree l, ExpressionTree r){
    operator = op;
    left = l;
    right =r;
  }

  //Return true when the node is a value, false when it is an operator
  //when the children are null, the current tree is an operator
  private boolean isValue(){
    return left==null && right ==null;
  }

  //Return false when the node is a value, true when it is an operator
  private boolean isOperator(){
    return !isValue();
  }

  //To simplify things, you get a method to use to convert the
  //operator and two values into a result.
  private double apply(double a, double b, char op){
   if(op == '+'){
    return a+b;
   }else if(op == '-'){
    return a-b;
   }else if(op == '*'){
    return a*b;
   }else if(op == '^'){
     return Math.pow(a,b);
   }else if(op == 'r'){
     return Math.pow(a,1/b);  
   }else{ //  if(op == '/'){ //or any invalid operators
    return a/b;
   }

  }

 }