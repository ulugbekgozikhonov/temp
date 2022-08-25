package uz.jl.temp;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {

    @Builder.Default
    private String id = UUID.randomUUID().toString();
    private String name;
}
