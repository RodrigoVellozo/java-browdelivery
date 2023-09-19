// package com.rodrigovellozo.browdelivery.carga;

// import java.math.BigDecimal;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.UUID;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.ApplicationArguments;
// import org.springframework.boot.ApplicationRunner;
// import org.springframework.stereotype.Component;

// import com.rodrigovellozo.browdelivery.models.Cliente;
// import com.rodrigovellozo.browdelivery.models.Item;
// import com.rodrigovellozo.browdelivery.models.Pedido;
// import com.rodrigovellozo.browdelivery.repositories.ClienteRepository;

// @Component
// public class RepositoryTest implements ApplicationRunner {

//     private static final UUID ID_CLIENTE_NEYMAR = UUID.randomUUID();
//     private static final UUID ID_CLIENTE_PAYET = UUID.randomUUID();
//     private static final UUID ID_ITEM1 = UUID.randomUUID();
//     private static final UUID ID_ITEM2 = UUID.randomUUID();
//     private static final UUID ID_ITEM3 = UUID.randomUUID();
//     private static final UUID ID_PEDIDO1 = UUID.randomUUID();
//     private static final UUID ID_PEDIDO2 = UUID.randomUUID();
//     private static final UUID ID_PEDIDO3 = UUID.randomUUID();

//     @Autowired
//     private ClienteRepository clienteRepository;

//     @Override
//     public void run(ApplicationArguments applicationArguments) throws Exception {
//         System.out.println(">>>	Iniciando	carga	de	dados...");
//         Cliente neymarJr = new Cliente(ID_CLIENTE_NEYMAR, "Neymar da Silva Santos Junior", "Riade");
//         Cliente dimitriPayet = new Cliente(ID_CLIENTE_PAYET, "Dimitri Payet", "Rio de Janeiro");

//         Item item1 = new Item(ID_ITEM1, "Spaten 600ml | Apenas o Líquido - Pack de 12 Unidades", new BigDecimal("94.68"));
//         Item item2 = new Item(ID_ITEM2, "Gin Tanqueray 750ml", new BigDecimal("123.40"));
//         Item item3 = new Item(ID_ITEM3, "Stella Pure Gold 330ml - Pack 6 unidades", new BigDecimal("35.94"));

//         List<Item> listaPedidoNeymar1 = new ArrayList<>();
//         listaPedidoNeymar1.add(item1);
//         List<Item> listaPedidoDimitriPayet = new ArrayList<>();
//         listaPedidoDimitriPayet.add(item2);
//         listaPedidoDimitriPayet.add(item3);

//         Pedido pedidoDoNeymar = new Pedido(ID_PEDIDO1, neymarJr, listaPedidoNeymar1, item1.getPreco());
//         neymarJr.novoPedido(pedidoDoNeymar);

//         Pedido pedidoDoDimitriPayet = new Pedido(ID_PEDIDO2, dimitriPayet, listaPedidoDimitriPayet, item2.getPreco().add(item3.getPreco()) );
//         dimitriPayet.novoPedido(pedidoDoDimitriPayet);
        
//         System.out.println(">>>	Pedido	1	-	Neymar Jr.	:	" + pedidoDoNeymar);
//         System.out.println(">>>	Pedido	2	-	Dimitri Payet:	" + pedidoDoDimitriPayet);

//         clienteRepository.saveAndFlush(dimitriPayet);
        
//         System.out.println(">>>	Gravado	cliente	2:	" + dimitriPayet);
        
//         List<Item> listaPedidoneymar2 = new ArrayList<>();
//         listaPedidoneymar2.add(item2);

//         Pedido pedido2DoNeymar = new Pedido(ID_PEDIDO3, neymarJr, listaPedidoneymar2, item2.getPreco());
        
//         neymarJr.novoPedido(pedido2DoNeymar);
//         clienteRepository.saveAndFlush(neymarJr);

//         System.out.println(">>>	Pedido	2-Neymar Jr. :" + pedido2DoNeymar);
//         System.out.println(">>>	Gravado	cliente	1:	" + neymarJr);

//     }

// }
