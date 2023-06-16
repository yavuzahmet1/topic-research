import React from 'react'
import CartSummary from './CartSummary'
import { Button, Container, Menu } from 'semantic-ui-react'

function Navi() {
    return (
        <Menu inverted fixed>
            <Container>

                <Menu.Item
                    name='home'

                />
                <Menu.Item
                    name='messages'

                />

                <Menu.Menu position='right'>
                    <CartSummary />

                    <Menu.Item>
                        <Button primary>Sign Up</Button>
                    </Menu.Item>
                </Menu.Menu>

            </Container>
        </Menu>
    )
}

export default Navi