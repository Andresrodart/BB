#include <bits/stdc++.h>
#ifdef _WIN32
#include <fcntl.h>
#endif
#include <bits/stdc++.h>
int64_t a = 2*(2+3*8/2);
double b = 2.0;
std::wstring andr_s = L"andrés, es, raro";
std::wstring cadena = L"hola";
void mi_imprime ( std::wstring s, int64_t a ) {
	std::wcout <<  s << " " << 2 << " " << andr_s << " " << a  << std::endl;
}
int64_t suma ( int64_t a, int64_t b ) {
	return a+b;
}
int main ( int argc, char const *argv[] ) {
	#ifdef _WIN32
	_setmode(_fileno(stdout), 0x00020000); //Make output use UTF-16
	#endif
	#ifdef linux
	std::wcout.sync_with_stdio(false);
	std::wcout.imbue(std::locale("en_US.utf8"));
	#endif
	
	std::wstring pedro = L"hola";
	int64_t ca = 2;
	if(a > 10){
		a = 10;
	}else if(a == 20){
		a = 21;
	}else{
		a = 0;
	}
	while(a < 10){
		a+=1;
	}
	std::vector<int64_t> mi_lista { 1, 2, 3, 4 };
	int64_t sum = suma( 2, a );
	mi_imprime( L"mi_funcion", sum );
	return ca+2;
}