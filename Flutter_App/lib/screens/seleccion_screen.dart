import 'package:flutter/material.dart';

class SeleccionScreen extends StatefulWidget {
  const SeleccionScreen({super.key});

  @override
  State<SeleccionScreen> createState() => _SeleccionScreenState();
}

class _SeleccionScreenState extends State<SeleccionScreen> {
  bool check = false;
  bool switchValue = false;
  String radioValue = "";

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("Selección")),
      body: Column(
        children: [
          CheckboxListTile(
            value: check,
            onChanged: (val) => setState(() => check = val!),
            title: const Text("Acepto términos"),
          ),
          SwitchListTile(
            value: switchValue,
            onChanged: (val) => setState(() => switchValue = val),
            title: const Text("Activar notificaciones"),
          ),
          RadioListTile(
            value: "Opción 1",
            groupValue: radioValue,
            onChanged: (val) => setState(() => radioValue = val.toString()),
            title: const Text("Opción 1"),
          ),
          RadioListTile(
            value: "Opción 2",
            groupValue: radioValue,
            onChanged: (val) => setState(() => radioValue = val.toString()),
            title: const Text("Opción 2"),
          ),
        ],
      ),
    );
  }
}
