package com.apex.erp.controller;

import com.apex.erp.model.Produto;
import com.apex.erp.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
@CrossOrigin("*") // 🔥 ISSO PERMITE QUE SUA TELA CONECTE NA API
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
}