package br.ufc.quixada.eda.grafos;

public class Aresta {
	public int u;
	public int v;
	public int w;


	public Aresta(int u, int v, int w) {
		this.u = u;
		this.v = v;
		this.w = w;
	}

	public int getU() {
		return u;
	}

	public void setU(int u) {
		this.u = u;
	}

	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}


}
