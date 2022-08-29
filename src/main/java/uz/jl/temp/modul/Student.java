package uz.jl.temp.modul;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private String lastName;
    private Book book;
    private Integer age;

    public static void hello(){
        System.out.println("Hello Students");
    }
}
