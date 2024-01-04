void removeEven(Collection<Integer> a)
  {
Iterator<Integer> it = a.iterator();
  
  while(it.hasNext())
    {

      int x = (int)it.next();

      if(x%2==0)
      {

        it.remove();
        
      }
    }
  }
