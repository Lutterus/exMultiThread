package exMultiThread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TESTE 2 com 2 threads
		// cria Thread
		Thread t1 = new Thread(new MyThread(0));
		Thread t2 = new Thread(new MyThread(1));

		// inicia a thread
		t1.start();
		t2.start();

		// forca para esperar a finalizacao da thread
		t1.join();
		t2.join();
	}

}
