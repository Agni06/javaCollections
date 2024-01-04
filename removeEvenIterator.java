void removeEven(Collection<Integer> a)
  {

  while(a.hasNext())
    {

      int x = a.next();

      if(x%2==0)
      {

        a.remove();
        
      }
    }
  }
