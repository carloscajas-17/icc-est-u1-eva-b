package Controllers;

import java.util.ArrayList;

import Models.Book;

public class BookController {

  
    }

    public void sortByname(Book[] libros){
       
        int method = view.selectSortingMethod();
        Book[] array = libros.toArray(new Books[]);
        sorter.sortByNameWithBubble(array);
        
        libros = new ArrayList<>(java.util.List.of(array));
        System.out.println("Lista ordenada.");
    }


    
    public void searchByname(Book[] libros,String nombre){
        public void searchPerson() {
            
                System.out.println("Criterio inválido.");
            }
    }
}









































