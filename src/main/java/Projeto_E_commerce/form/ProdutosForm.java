package Projeto_E_commerce.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutosForm {
    private Long clienteid;

    private String titulo;

    private String descricao;

    private double preco;







}