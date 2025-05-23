package com.gerenciamento.estoque.demo.produtos.dto;

import com.gerenciamento.estoque.demo.produtos.model.Produtos;

public record ProdutosListagemDTO(Long id, String nome, String descricao, int quantidade, Long usuarioId) {


    public ProdutosListagemDTO(Produtos produtosPaginados) {
        this(produtosPaginados.getId(), produtosPaginados.getNome(), produtosPaginados.getDescricao(), produtosPaginados.getQuantidade(), produtosPaginados.getUsuario().getId());
    }
}
