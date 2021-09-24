package consultorio;

import java.util.Date;

public class consulta {
	
		private Date dataConsulta;
		private Date horarioConsulta;
		private boolean consultaRetorno;
		private String statusConsulta;
		private int valorConsulta;
		
		public Date getDataConsulta() {
			return dataConsulta;
		}
		public void setDataConsulta(Date dataConsulta) {
			this.dataConsulta = dataConsulta;
		}
		public Date getHorarioConsulta() {
			return horarioConsulta;
		}
		public void setHorarioConsulta(Date horarioConsulta) {
			this.horarioConsulta = horarioConsulta;
		}
		public boolean isConsultaRetorno() {
			return consultaRetorno;
		}
		public void setConsultaRetorno(boolean consultaRetorno) {
			this.consultaRetorno = consultaRetorno;
		}
		public String getStatusConsulta() {
			return statusConsulta;
		}
		public void setStatusConsulta(String statusConsulta) {
			this.statusConsulta = statusConsulta;
		}
		public int getValorConsulta() {
			return valorConsulta;
		}
		public void setValorConsulta(int valorConsulta) {
			this.valorConsulta = valorConsulta;
		}
		
	}