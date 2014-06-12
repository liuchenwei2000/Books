/**
 * 
 */
package principle.DIP.v1;

/**
 * ��λ���ʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-10-31
 */
public class LayerDemo {
}

/**
 * ��ҵ���Բ�
 * <p>
 * ��������Ƶ���PolicyLayer������MechanismLayer
 * ��MechanismLayer������UtilityLayer������PolicyLayerҲ������UtilityLayer
 * ����PolicyLayer��������һֱ��UtilityLayer�ĸĶ��������е�
 */
class PolicyLayer {

	// �����ڵͲ�� MechanismLayer
	private MechanismLayer mechanismLayer;

	public MechanismLayer getMechanismLayer() {
		return mechanismLayer;
	}

	public void setMechanismLayer(MechanismLayer mechanismLayer) {
		this.mechanismLayer = mechanismLayer;
	}
}

/**
 * ���Ʋ�
 */
class MechanismLayer {

	// �����ڵͲ�� UtilityLayer
	private UtilityLayer utilityLayer;

	public UtilityLayer getUtilityLayer() {
		return utilityLayer;
	}

	public void setUtilityLayer(UtilityLayer utilityLayer) {
		this.utilityLayer = utilityLayer;
	}
}

/**
 * ���߲�
 */
class UtilityLayer {

	// some codes
}