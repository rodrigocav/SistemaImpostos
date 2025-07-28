# 📊 Sistema de Cálculo de Impostos (PIS e IPI)

## 🎯 Objetivo

Este projeto tem como finalidade implementar um sistema simples de **cálculo e gerenciamento de impostos** sobre vendas de produtos, com foco nos tributos brasileiros **PIS** (Programa de Integração Social) e **IPI** (Imposto sobre Produtos Industrializados).

O sistema permite que o usuário cadastre uma empresa e registre múltiplos impostos, calculando automaticamente seus valores com base em fórmulas específicas.

---

## 🧱 Funcionalidades

- 📌 Cadastro do nome da empresa.
- ➕ Inserção de vários impostos do tipo `PIS` ou `IPI`.
- 🧮 Cálculo automático dos valores dos impostos.
- 🧾 Exibição da lista de impostos com suas descrições e valores.
- ✅ Aceita entradas numéricas com **vírgula ou ponto** (adaptado ao padrão brasileiro).

---

## ⚙️ Tecnologias Utilizadas

- **Java SE** (console application)
- **NetBeans IDE**
- Programação Orientada a Objetos (POO)
  - Interface `Imposto`
  - Encapsulamento
  - Polimorfismo com lista de impostos
  - Organização por classes especializadas

---

## 📐 Arquitetura das Classes

| Arquivo         | Descrição |
|-----------------|-----------|
| `Imposto.java`  | Interface comum a todos os impostos. |
| `PIS.java`      | Implementação do imposto PIS. |
| `IPI.java`      | Implementação do imposto IPI. |
| `Pagamentos.java` | Representa a empresa e a lista de impostos. |
| `Main.java`     | Classe principal com entrada de dados e exibição dos resultados. |

---

## 📊 Fórmulas Implementadas

- **PIS**  
  ```plaintext
  (valorDébito - valorCrédito) * 1,65%
