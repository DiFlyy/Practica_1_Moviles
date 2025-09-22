import 'package:flutter/material.dart';

class InformacionScreen extends StatefulWidget {
  const InformacionScreen({super.key});

  @override
  State<InformacionScreen> createState() => _InformacionScreenState();
}

class _InformacionScreenState extends State<InformacionScreen> {
  int progress = 50;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("Información")),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          children: [
            const Text("Los elementos de información permiten mostrar datos."),
            const SizedBox(height: 16),
            const Text("Texto informativo"),
            const SizedBox(height: 16),
            GestureDetector(
              onTap: () {
                setState(() {
                  progress = (progress + 10).clamp(0, 100);
                });
              },
              child: const Icon(Icons.image, size: 80, color: Colors.blue),
            ),
            const SizedBox(height: 16),
            LinearProgressIndicator(value: progress / 100),
          ],
        ),
      ),
    );
  }
}
