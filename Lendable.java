/**
 * ���Ⱑ�� �������̽�
 * @author �ֿ���
 *
 */
interface Lendable {
	/**
	 * �����Ѵ�.
	 * @param borrowe : ������ �̸�
	 * @param date : ���� ��¥
	 */
    void checkOut(String borrower, String date); 
    /**
     * �ݳ��Ѵ�.
     */
    void checkIn(); 
}