package TP2_Lombok_Builder;

public class MainTP2 {
    public static void main(String[] args) {
        Usuario u1 = Usuario.builder()
                .id(1)
                .nombre("Pedro")
                .email("pedro@mail.com")
                .build();

        Usuario u2 = Usuario.builder()
                .id(2)
                .nombre("Ana")
                .email("ana@mail.com")
                .build();

        System.out.println(u1);
        System.out.println(u2);
    }
}

