package github.EduMacedoEng.PredictAnimal.Model.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Animal {
    public Animal(String nome, String tipo, String descricao){
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 10)
    private String tipo;

    @Column(length = 150)
    private String descricao;

    @Column(name = "data_Cadastro")
    private LocalDate dataCadastro;

    @PrePersist
    public void prePersist(){
        setDataCadastro(LocalDate.now());
    }
}
