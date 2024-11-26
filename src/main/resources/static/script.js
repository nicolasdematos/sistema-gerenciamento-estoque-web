/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */

function validarRegistro() {
    const quantidade = document.getElementById("quantidade").value;
    if (quantidade <= 0) {
        alert("A quantidade deve ser maior que zero.");
        return false;
    }
    return true;
}




function validarCadastroProduto() {
    const nome = document.getElementById("nome").value;
    const codigo = document.getElementById("codigo").value;
    const categoria = document.getElementById("categoria").value;
    const quantidade = document.getElementById("quantidade").value;
    const localizacao = document.getElementById("localizacao").value;

    if (!nome || !codigo || !categoria || !quantidade || !localizacao) {
        alert("Todos os campos são obrigatórios!");
        return false;
    }

    if (quantidade <= 0) {
        alert("A quantidade deve ser maior que zero.");
        return false;
    }


    alert("Produto cadastrado com sucesso!");
    return true;
}







function listarMovimentacoes() {
    //                           integrado com o back-end mais tarde.
    const movimentacoes = [
        { id: 1, tipo: "Entrada", produto: "Produto A", quantidade: 10 },
        { id: 2, tipo: "Saída", produto: "Produto B", quantidade: 5 },
        { id: 3, tipo: "Entrada", produto: "Produto C", quantidade: 20 },
    ];

    const container = document.getElementById('movimentacoesContainer');
    container.innerHTML = "<h2>Movimentações Recentes</h2>";

    movimentacoes.forEach(mov => {
        const div = document.createElement('div');
        div.classList.add('movimentacao');
        div.innerHTML = `
            <p>ID: ${mov.id} - Tipo: ${mov.tipo} - Produto: ${mov.produto} - Quantidade: ${mov.quantidade}</p>
        `;
        container.appendChild(div);
    });
}
