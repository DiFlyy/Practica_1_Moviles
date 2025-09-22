import 'package:flutter/material.dart';
import 'screens/textfields_screen.dart';
import 'screens/botones_screen.dart';
import 'screens/seleccion_screen.dart';
import 'screens/listas_screen.dart';
import 'screens/informacion_screen.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Práctica Fragments Flutter',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: const MainScreen(),
    );
  }
}

class MainScreen extends StatefulWidget {
  const MainScreen({super.key});

  @override
  State<MainScreen> createState() => _MainScreenState();
}

class _MainScreenState extends State<MainScreen> {
  int _selectedIndex = 0;

  final List<Widget> _screens = const [
    TextFieldsScreen(),
    BotonesScreen(),
    SeleccionScreen(),
    ListasScreen(),
    InformacionScreen(),
  ];

  void _onItemTapped(int index) {
    setState(() {
      _selectedIndex = index;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: _screens[_selectedIndex],
      bottomNavigationBar: BottomNavigationBar(
        type: BottomNavigationBarType.fixed,
        items: const [
          BottomNavigationBarItem(icon: Icon(Icons.text_fields), label: 'TextFields'),
          BottomNavigationBarItem(icon: Icon(Icons.smart_button), label: 'Botones'),
          BottomNavigationBarItem(icon: Icon(Icons.check_box), label: 'Selección'),
          BottomNavigationBarItem(icon: Icon(Icons.list), label: 'Listas'),
          BottomNavigationBarItem(icon: Icon(Icons.info), label: 'Info'),
        ],
        currentIndex: _selectedIndex,
        onTap: _onItemTapped,
      ),
    );
  }
}
