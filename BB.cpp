#include <bits/stdc++.h>
#if !defined(True)
#define True  (1==1)
#endif
#if !defined(False)
#define False (!True)
#endif
#ifdef _WIN32
#include <fcntl.h>
#endif

int64_t a = 2*(2+3*8/2);
double b = 2.0;
std::wstring andr_s = L"andrés, es, raro";
std::wstring cadena = L"hola";
class pila {
	private :
	std::deque<int64_t> mi_pila;
	int64_t tama_o;
	
	public :
	pila ( std::deque<int64_t> entrada ) {
		mi_pila = entrada;
	}
	void push ( int64_t a ) {
		mi_pila.push_back(a);
	}
	
};
void mi_imprime ( std::wstring s, int64_t a ) {
	std::wcout <<  s << " " << 2 << " " << andr_s << " " << a  << std::endl;
}
int64_t suma ( int64_t a, int64_t b ) {
	int64_t c = a+b;
	return a+b;
}
int main ( int argc, char const *argv[] ) {
	#ifdef _WIN32
	_setmode(_fileno(stdout), 0x00020000);
	_setmode( _fileno(stdin), 0x00020000 );
	#endif
	#ifdef linux
	std::wcout.sync_with_stdio(false);
	std::wcout.imbue(std::locale("en_US.utf8"));
	wcin.imbue(std::locale());
	#endif
	
	std::wstring nombre = L"hola";
	int64_t ca = 2;
	if(a > 10 && True){
		a = 10;
	}else if(a == 20){
		a = 21;
	}else{
		a = 0;
	}
	while(a < 10){
		a+=1;
	}
	for(int64_t x = 10; x < 100; x += 2){
		std::wcout <<  L"BB es lo máximo"  << std::endl;
	}
	std::deque<int64_t> mi_lista { 1, 2, 3, 4 };
	mi_lista.push_back(2);
	mi_lista.pop_front();
	mi_lista.pop_back();
	mi_lista.front();
	mi_lista.back();
	mi_lista[2];
	for(int64_t x = 10; x < mi_lista.size(); x += 2){
		std::wcout <<  L"BB es lo máximo"  << std::endl;
	}
	int64_t sum = suma( 2, a );
	mi_imprime( L"mi_funcion", sum );
	std::wcout << "ingresa tu nombre y tu edad: ";
	int64_t edad;
	std::wcin  >> nombre >> edad;
	std::wcout <<  L"tu nombre es: " << " " << nombre << " " << L" y tienes: " << " " << edad << " " << L" años"  << std::endl;
	return ca+2;
}