



// Parent class One
class One {
    
    public void print_geek() {
        System.out.println("Hello World");
    }
}

// Child class Two inherits from class One
class Two extends One {
    
    public void print_for() {
        System.out.println("This is java");
    }
}


class Three extends Two {
   
    public void print_lastgeek() {
        System.out.println("It is Good");
    }
}


class Abc {
    public static void main(String[] args) {
        // Creating an object of class Three
        Three g = new Three();
        
        g.print_geek();
        
        g.print_for();
        
        g.print_lastgeek();
    }
}
