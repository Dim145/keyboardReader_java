package lecture;

import java.util.Scanner;

public class Clavier
{
	public static char lire_char()
	{
		try
		{
			return new Scanner(System.in).nextLine().charAt(0);
		}
		catch( Exception e )
		{
			System.out.println("erreur : saisissez un caractère !");
			return Clavier.lire_char();
		}
	}

	public static int lire_int()
	{
		try
		{
			return new Scanner(System.in).nextInt();
		}
		catch( Exception e)
		{
			System.out.println("erreur : saisissez un nombre entier (int) entre -2147483648 et 2147483647");
			return Clavier.lire_int();
		}
	}

	public static Integer lireInteger()
	{
		return Clavier.lire_int();
	}

	public static String lireString()
	{
		return new Scanner(System.in).nextLine();
	}

	public static double lire_double()
	{
		try
		{
			return Double.parseDouble(Clavier.lireString());
		}
		catch(Exception e)
		{
			System.out.println("erreur : saisissez un nombre Double entre 4.9E-324 et 1.7976931348623157E308");
			return Clavier.lireDouble();
		}
	}

	public static float lire_float()
	{
		try
		{
			return Float.parseFloat(Clavier.lireString());
		}
		catch(Exception e)
		{
			System.out.println("erreur : saisissez un nombre réel (float) entre 1.4E-45 et 3.4028235E38");
			return Clavier.lire_float();
		}
	}

	public static long lire_long()
	{
		try
		{
			return new Scanner(System.in).nextLong();
		}
		catch(Exception e)
		{
			System.out.println("erreur : saisissez un nombre entier (long) entre -9223372036854775808 et 9223372036854775807");
			return Clavier.lire_long();
		}
	}

	public static short lire_short()
	{
		try
		{
			return new Scanner(System.in).nextShort();
		}
		catch(Exception e)
		{
			System.out.println("erreur : saisissez un nombre entier (short) entre -32768 et 32767");
			return Clavier.lire_short();
		}
	}

	public static byte lire_byte()
	{
		try
		{
			return new Scanner(System.in).nextByte();
		}
		catch(Exception e)
		{
			System.out.println("erreur : saisissez un nombre entier (byte) entre -128 et 127");
			return Clavier.lire_byte();
		}
	}

	public static Byte lireByte()
	{
		return Clavier.lire_byte();
	}

	public static Short lireShort()
	{
		return Clavier.lire_short();
	}

	public static Long lireLong()
	{
		return Clavier.lire_long();
	}

	public static Float lireFloat()
	{
		return Clavier.lire_float();
	}

	public static Double lireDouble()
	{
		return Clavier.lire_double();
	}

	public static Character lireCharacter()
	{
		return Clavier.lire_char();
	}

	public static boolean lire_boolean()
	{
		try
		{
			String saisie = Clavier.lireString().toLowerCase();
			char tmp = saisie.charAt(0);

			if( tmp == 'v' || tmp == '1' || "true".equals(saisie)       ) return true;
			else if( tmp == 'f' || tmp == '0' || "false".equals(saisie) ) return false;
			else
			{
				System.out.println("erreur : saisissez un nombre boolean (1, 0),(V,F),(true, false)");
				return Clavier.lire_boolean();
			}
		}
		catch (Exception e)
		{
			System.out.println("erreur : saisissez un nombre boolean (1, 0),(V,F),(true, false)");
			return Clavier.lire_boolean();
		}
	}

	public static Boolean lireBoolean()
	{
		return Clavier.lire_boolean();
	}
}