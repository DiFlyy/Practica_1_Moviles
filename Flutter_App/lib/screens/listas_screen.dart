import 'package:flutter/material.dart';

class ListasScreen extends StatelessWidget {
  const ListasScreen({super.key});

  @override
  Widget build(BuildContext context) {
    final items = ["Elemento 1", "Elemento 2", "Elemento 3"];

    return Scaffold(
      appBar: AppBar(title: const Text("Listas")),
      body: ListView.builder(
        itemCount: items.length,
        itemBuilder: (context, index) {
          return ListTile(
            title: Text(items[index]),
            onTap: () {
              ScaffoldMessenger.of(context).showSnackBar(
                SnackBar(content: Text("Seleccionaste ${items[index]}")),
              );
            },
          );
        },
      ),
    );
  }
}
