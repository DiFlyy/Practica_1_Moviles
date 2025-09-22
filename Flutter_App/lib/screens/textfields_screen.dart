import 'package:flutter/material.dart';

class TextFieldsScreen extends StatelessWidget {
  const TextFieldsScreen({super.key});

  @override
  Widget build(BuildContext context) {
    final controller = TextEditingController();

    return Scaffold(
      appBar: AppBar(title: const Text("TextFields")),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          children: [
            const Text("Los TextFields permiten ingresar texto."),
            TextField(
              controller: controller,
              decoration: const InputDecoration(
                labelText: "Escribe tu nombre",
              ),
            ),
            ElevatedButton(
              onPressed: () {
                ScaffoldMessenger.of(context).showSnackBar(
                  SnackBar(content: Text("Hola ${controller.text}!")),
                );
              },
              child: const Text("Mostrar saludo"),
            ),
          ],
        ),
      ),
    );
  }
}
